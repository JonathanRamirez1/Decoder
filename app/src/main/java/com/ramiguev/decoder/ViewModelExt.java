package com.ramiguev.decoder;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import org.jetbrains.annotations.NotNull;

public class ViewModelExt {

    @NotNull
    public static final ViewModelProvider.Factory createFactory(@NotNull final ViewModel $this$createFactory) {
        return new ViewModelProvider.Factory() {
            @NotNull
            public ViewModel create(@NotNull Class modelClass) {
                return $this$createFactory;
            }
        };
    }
}
