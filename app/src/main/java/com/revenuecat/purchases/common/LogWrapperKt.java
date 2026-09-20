package com.revenuecat.purchases.common;

import com.revenuecat.purchases.LogHandler;
import defpackage.wu;

/* JADX INFO: loaded from: classes3.dex */
public final class LogWrapperKt {
    private static LogHandler currentLogHandler = new DefaultLogHandler();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogIntent.values().length];
            iArr[LogIntent.DEBUG.ordinal()] = 1;
            iArr[LogIntent.GOOGLE_ERROR.ordinal()] = 2;
            iArr[LogIntent.GOOGLE_WARNING.ordinal()] = 3;
            iArr[LogIntent.INFO.ordinal()] = 4;
            iArr[LogIntent.PURCHASE.ordinal()] = 5;
            iArr[LogIntent.RC_ERROR.ordinal()] = 6;
            iArr[LogIntent.RC_PURCHASE_SUCCESS.ordinal()] = 7;
            iArr[LogIntent.RC_SUCCESS.ordinal()] = 8;
            iArr[LogIntent.USER.ordinal()] = 9;
            iArr[LogIntent.WARNING.ordinal()] = 10;
            iArr[LogIntent.AMAZON_WARNING.ordinal()] = 11;
            iArr[LogIntent.AMAZON_ERROR.ordinal()] = 12;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final LogHandler getCurrentLogHandler() {
        return currentLogHandler;
    }

    public static final void log(LogIntent logIntent, String str) {
        String str2 = wu.M0(logIntent.getEmojiList(), "", null, null, null, 62) + ' ' + str;
        switch (WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogUtilsKt.debugLog(str2);
                break;
            case 2:
                LogUtilsKt.errorLog$default(str2, null, 2, null);
                break;
            case 3:
                LogUtilsKt.warnLog(str2);
                break;
            case 4:
                LogUtilsKt.infoLog(str2);
                break;
            case 5:
                LogUtilsKt.debugLog(str2);
                break;
            case 6:
                LogUtilsKt.errorLog$default(str2, null, 2, null);
                break;
            case 7:
                LogUtilsKt.infoLog(str2);
                break;
            case 8:
                LogUtilsKt.debugLog(str2);
                break;
            case 9:
                LogUtilsKt.debugLog(str2);
                break;
            case 10:
                LogUtilsKt.warnLog(str2);
                break;
            case 11:
                LogUtilsKt.warnLog(str2);
                break;
            case 12:
                LogUtilsKt.errorLog$default(str2, null, 2, null);
                break;
        }
    }

    public static final void setCurrentLogHandler(LogHandler logHandler) {
        currentLogHandler = logHandler;
    }
}
