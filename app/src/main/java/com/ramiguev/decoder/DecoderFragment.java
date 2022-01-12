package com.ramiguev.decoder;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ramiguev.decoder.databinding.FragmentDecoderBinding;
import java.math.BigInteger;

public class DecoderFragment extends Fragment {

    private FragmentDecoderBinding binding;
    private Frame frame = new Frame();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDecoderBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.textViewFrame.setText(frame.loadFrame());
        binding.button.setOnClickListener(view1 -> {
            showAlertDialogFrame();
            setBitmap();
        });
    }

    private void showAlertDialogFrame() {
        FragmentManager fragmentManager = DecoderFragment.this.getFragmentManager();
        if (fragmentManager != null) {
            (new AlertDialogFrame()).show(fragmentManager, "");
        }
    }

    private void setBitmap() {
        String bit = frame.loadFrame().substring(18, 34);
        String bina = hexToBin(bit);
        String bina2 = validBit(bina);
        bina = bina2+bina;
        activeBits(bina);
    }
    static String validBit(String s) {
        String cer = "";
        int stringLength = s.length();
        int tc = 64 - stringLength;
        for (int i = 0; i < tc; i++) {
            cer = "0" + cer;
        }
        return cer;
    }

    static String hexToBin(String frame) {
        String preBin = new BigInteger(frame, 16).toString(2);
        Integer length = preBin.length();
        if (length < 8) {
            for (int i = 0; i < 8 - length; i++) {
                preBin = "0" + preBin;
            }
        }
        return preBin;
    }

    public void activeBits(String frame) {
        binding.checkboxBit1.setChecked(frame.charAt(0) == '1');
        binding.checkboxBit2.setChecked(frame.charAt(1) == '1');
        binding.checkboxBit3.setChecked(frame.charAt(2) == '1');
        binding.checkboxBit4.setChecked(frame.charAt(3) == '1');
        binding.checkboxBit5.setChecked(frame.charAt(4) == '1');
        binding.checkboxBit6.setChecked(frame.charAt(5) == '1');
        binding.checkboxBit7.setChecked(frame.charAt(6) == '1');
        binding.checkboxBit8.setChecked(frame.charAt(7) == '1');
        binding.checkboxBit9.setChecked(frame.charAt(8) == '1');
        binding.checkboxBit10.setChecked(frame.charAt(9) == '1');
        binding.checkboxBit11.setChecked(frame.charAt(10) == '1');
        binding.checkboxBit12.setChecked(frame.charAt(11) == '1');
        binding.checkboxBit13.setChecked(frame.charAt(12) == '1');
        binding.checkboxBit14.setChecked(frame.charAt(13) == '1');
        binding.checkboxBit15.setChecked(frame.charAt(14) == '1');
        binding.checkboxBit16.setChecked(frame.charAt(15) == '1');
        binding.checkboxBit17.setChecked(frame.charAt(16) == '1');
        binding.checkboxBit18.setChecked(frame.charAt(17) == '1');
        binding.checkboxBit19.setChecked(frame.charAt(18) == '1');
        binding.checkboxBit20.setChecked(frame.charAt(19) == '1');
        binding.checkboxBit21.setChecked(frame.charAt(20) == '1');
        binding.checkboxBit22.setChecked(frame.charAt(21) == '1');
        binding.checkboxBit23.setChecked(frame.charAt(22) == '1');
        binding.checkboxBit24.setChecked(frame.charAt(23) == '1');
        binding.checkboxBit25.setChecked(frame.charAt(24) == '1');
        binding.checkboxBit26.setChecked(frame.charAt(25) == '1');
        binding.checkboxBit27.setChecked(frame.charAt(26) == '1');
        binding.checkboxBit28.setChecked(frame.charAt(27) == '1');
        binding.checkboxBit29.setChecked(frame.charAt(28) == '1');
        binding.checkboxBit30.setChecked(frame.charAt(29) == '1');
        binding.checkboxBit31.setChecked(frame.charAt(30) == '1');
        binding.checkboxBit32.setChecked(frame.charAt(31) == '1');
        binding.checkboxBit33.setChecked(frame.charAt(32) == '1');
        binding.checkboxBit34.setChecked(frame.charAt(33) == '1');
        binding.checkboxBit35.setChecked(frame.charAt(34) == '1');
        binding.checkboxBit36.setChecked(frame.charAt(35) == '1');
        binding.checkboxBit37.setChecked(frame.charAt(36) == '1');
        binding.checkboxBit38.setChecked(frame.charAt(37) == '1');
        binding.checkboxBit39.setChecked(frame.charAt(38) == '1');
        binding.checkboxBit40.setChecked(frame.charAt(39) == '1');
        binding.checkboxBit41.setChecked(frame.charAt(40) == '1');
        binding.checkboxBit42.setChecked(frame.charAt(41) == '1');
        binding.checkboxBit43.setChecked(frame.charAt(42) == '1');
        binding.checkboxBit44.setChecked(frame.charAt(43) == '1');
        binding.checkboxBit45.setChecked(frame.charAt(44) == '1');
        binding.checkboxBit46.setChecked(frame.charAt(45) == '1');
        binding.checkboxBit47.setChecked(frame.charAt(46) == '1');
        binding.checkboxBit48.setChecked(frame.charAt(47) == '1');
        binding.checkboxBit49.setChecked(frame.charAt(48) == '1');
        binding.checkboxBit50.setChecked(frame.charAt(49) == '1');
        binding.checkboxBit51.setChecked(frame.charAt(50) == '1');
        binding.checkboxBit52.setChecked(frame.charAt(51) == '1');
        binding.checkboxBit53.setChecked(frame.charAt(52) == '1');
        binding.checkboxBit54.setChecked(frame.charAt(53) == '1');
        binding.checkboxBit55.setChecked(frame.charAt(54) == '1');
        binding.checkboxBit56.setChecked(frame.charAt(55) == '1');
        binding.checkboxBit57.setChecked(frame.charAt(56) == '1');
        binding.checkboxBit58.setChecked(frame.charAt(57) == '1');
        binding.checkboxBit59.setChecked(frame.charAt(58) == '1');
        binding.checkboxBit60.setChecked(frame.charAt(59) == '1');
        binding.checkboxBit61.setChecked(frame.charAt(60) == '1');
        binding.checkboxBit62.setChecked(frame.charAt(61) == '1');
        binding.checkboxBit63.setChecked(frame.charAt(62) == '1');
        binding.checkboxBit64.setChecked(frame.charAt(63) == '1');
    }
}