package com.mfrdev.calendar_module.calendar;

import androidx.core.text.TextUtilsCompat;
import androidx.core.view.ViewCompat;

import java.util.Locale;

class LocalUtils {

  private static boolean isUserCustomizable;
  private static boolean isRTL;

  private LocalUtils() { }

  static boolean isRTL() {
    if(isUserCustomizable){
      return isRTL;
    }
    return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault())
        == ViewCompat.LAYOUT_DIRECTION_RTL;
  }

  static void userChooseRTLFunction(boolean isRTL){
    LocalUtils.isUserCustomizable = true;
    LocalUtils.isRTL = isRTL;
  }
}
