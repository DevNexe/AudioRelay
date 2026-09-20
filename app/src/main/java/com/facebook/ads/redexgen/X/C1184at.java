package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1184at extends C04046m {
    public static byte[] A04;

    @Nullable
    public ConfigurationInfo A00;
    public final ActivityManager.RunningAppProcessInfo A01;
    public final ActivityManager A02;
    public final Context A03;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{13, 15, 24, 5, 26, 5, 24, 21};
    }

    public C1184at(Context context, C6C c6c) {
        super(context, c6c);
        this.A03 = context;
        this.A02 = (ActivityManager) this.A03.getSystemService(A04(0, 8, 106));
        ActivityManager activityManager = this.A02;
        if (activityManager != null) {
            this.A00 = activityManager.getDeviceConfigurationInfo();
        }
        this.A01 = new ActivityManager.RunningAppProcessInfo();
    }

    public final InterfaceC04136v A0G() {
        return new C1187aw(this);
    }

    public final InterfaceC04136v A0H() {
        return new C1186av(this);
    }

    public final InterfaceC04136v A0I() {
        return new C1191b0(this);
    }

    public final InterfaceC04136v A0J() {
        return new C1190az(this);
    }

    public final InterfaceC04136v A0K() {
        return new C1189ay(this);
    }

    public final InterfaceC04136v A0L() {
        return new C1192b1(this);
    }

    public final InterfaceC04136v A0M() {
        return new C1188ax(this);
    }

    public final InterfaceC04136v A0N() {
        return new C1193b2(this);
    }

    public final InterfaceC04136v A0O() {
        return new C1185au(this);
    }

    public final InterfaceC04136v A0P() {
        return new C1195b4(this);
    }

    public final InterfaceC04136v A0Q() {
        return new C1194b3(this);
    }
}
