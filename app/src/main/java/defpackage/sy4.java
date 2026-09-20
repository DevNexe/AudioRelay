package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes.dex */
public class sy4 implements zzbt, RewardItem, u86, b2J {
    public sy4() {
    }

    public static final int a(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static final int c(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static final boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // defpackage.b2J
    public final void b(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        return "";
    }

    @Override // defpackage.y96
    public final /* bridge */ /* synthetic */ Object zzb() {
        Handler handler = w76.a;
        C0239D.L(handler);
        return handler;
    }

    public /* synthetic */ sy4(qa0 qa0Var) {
    }

    public /* synthetic */ sy4(Object obj) {
    }
}
