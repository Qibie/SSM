package com.learn.ssm.chapter10.rmi.commonservice;

import javax.swing.*;
import java.io.Serializable;

public interface Service extends Serializable {
    JPanel getGuiPanel();
}
