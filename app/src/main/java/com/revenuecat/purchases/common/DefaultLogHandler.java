package com.revenuecat.purchases.common;

import android.util.Log;
import com.revenuecat.purchases.LogHandler;

/* JADX INFO: loaded from: classes3.dex */
final class DefaultLogHandler implements LogHandler {
    @Override // com.revenuecat.purchases.LogHandler
    public void d(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void e(String str, String str2, Throwable th) {
        if (th != null) {
            Log.e(str, str2, th);
        } else {
            Log.e(str, str2);
        }
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void i(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void w(String str, String str2) {
        Log.w(str, str2);
    }
}
