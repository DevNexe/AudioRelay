package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0778Mj {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{100, -105, -126, -124, -113, -109, -120, -114, -115, 63, -120, -115, 63, -110, -126, -111, -124, -124, -115, 63, -120, -115, -109, -124, -111, -128, -126, -109, -120, -107, -124, 63, -126, -121, -124, -126, -118, 75, 63, -128, -110, -110, -108, -116, -120, -115, -122, 63, -120, -115, -109, -124, -111, -128, -126, -109, -120, -107, -124, 77, -103, -104, -96, -114, -101, -46, -55, -45, -53, -39};
    }

    static {
        A01();
        A01 = C0778Mj.class.getSimpleName();
    }

    public static boolean A02(C1075Xy c1075Xy) {
        return A03(c1075Xy) && C0779Mk.A03(c1075Xy);
    }

    public static boolean A03(C1075Xy c1075Xy) {
        if (c1075Xy == null) {
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) c1075Xy.getSystemService(A00(60, 5, 18));
            if (Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(A01, A00(0, 60, 8), e);
            c1075Xy.A06().A8y(A00(65, 5, 73), C04578z.A2R, new AnonymousClass90(e));
            return true;
        }
    }
}
