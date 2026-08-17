package com.tsh.mes.mos.lib.ofs.core.exception;

import com.tsh.starter.befw.lib.core.exception.ApplicationException;
import com.tsh.starter.befw.lib.core.exception.OperationException;
import com.tsh.starter.befw.lib.core.lifecycle.RequestLifeCycleVo;

public class OfsOperationException extends OperationException {
    public OfsOperationException(String message) {
        super(message);
    }
}
