package com.ramiguev.decoder;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;

import com.ramiguev.decoder.databinding.AlertDialogFrameBinding;

public class AlertDialogFrame extends DialogFragment {

    private AlertDialogFrameBinding binding;
    private DecoderViewModel decoderViewModel;
    private Frame frame = new Frame();

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        binding = AlertDialogFrameBinding.inflate(
                getLayoutInflater(), null, false);
        decoderViewModel = new ViewModelProvider(this).get(DecoderViewModel.class);
        setData();

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(binding.getRoot())
                .setCancelable(false)
                .setTitle("Resultado de la trama")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getContext(), "Trama mostrada", Toast.LENGTH_SHORT).show();
                    }
                });

        return builder.create();
    }

    private void setData() {
        String msgType = frame.loadFrame().substring(14, 18);
        binding.textViewMsgType.setText(": " + msgType);
        binding.textViewMsgType.setTextColor(getResources().getColor(R.color.textColor_red));
        Log.e("frame", "Esta es la trama: "+msgType);

        String bitmap = frame.loadFrame().substring(18, 34);
        binding.textViewBitmap.setText(": " + decoderViewModel.setSpace(bitmap));
        binding.textViewBitmap.setTextColor(getResources().getColor(R.color.textColor_green));

        String processing = frame.loadFrame().substring(34, 40);
        binding.textViewProcessingCode.setText(": " + processing);
        binding.textViewProcessingCode.setTextColor(getResources().getColor(R.color.textColor_blue));

        String system = frame.loadFrame().substring(40, 46);
        binding.textViewSystemTraceNo.setText(": " + system);
        binding.textViewSystemTraceNo.setTextColor(getResources().getColor(R.color.textColor_orange));

        String nii = frame.loadFrame().substring(47, 50);
        binding.textViewNii.setText(": " + nii);
        binding.textViewNii.setTextColor(getResources().getColor(R.color.textColor_purple));

        String response = frame.loadFrame().substring(50, 54);
        binding.textViewResponseCode.setText(": " + decoderViewModel.replaceCharacter(response));
        binding.textViewResponseCode.setTextColor(getResources().getColor(R.color.textColor_red));

        String terminal = frame.loadFrame().substring(54, 70);
        binding.textViewTerminalID.setText(": " + decoderViewModel.replaceCharacter(terminal));
        binding.textViewTerminalID.setTextColor(getResources().getColor(R.color.textColor_green));

        String field60 = frame.loadFrame().substring(74, 164);
        binding.textViewField60.setText(": " + decoderViewModel.unHex(field60));
        binding.textViewField60.setTextColor(getResources().getColor(R.color.textColor_blue));

        String field61 = frame.loadFrame().substring(166, 258);
        binding.textViewField61.setText(": " + decoderViewModel.unHex(field61));
        binding.textViewField61.setTextColor(getResources().getColor(R.color.textColor_orange));

        String msgAuthCode = frame.loadFrame().substring(268, 284);
        binding.textViewMsgAuthCode.setText(": " + decoderViewModel.setSpace(msgAuthCode));
        binding.textViewMsgAuthCode.setTextColor(getResources().getColor(R.color.textColor_purple));
    }
}
