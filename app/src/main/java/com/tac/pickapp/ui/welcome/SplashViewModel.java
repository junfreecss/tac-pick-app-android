package com.tac.pickapp.ui.welcome;

import com.tac.pickapp.interactor.UseCase;
import com.tac.pickapp.ui.viewmodel.BaseVM;

public class SplashViewModel extends BaseVM {

    public SplashViewModel(UseCase useCase) {
        super(useCase);
    }

    @Override
    protected Class<?> resolveLoggerName() {
        return SplashViewModel.class;
    }
}
