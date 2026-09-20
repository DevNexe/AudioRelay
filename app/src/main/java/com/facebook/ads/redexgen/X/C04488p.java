package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04488p implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C1074Xx A00;
    public final InterfaceC04548w A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, 28, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, 11, 7, 5, 70, 14, 9, 11, 13, 10, 7, 7, 3, 70, 9, 12, 27, 71, 86, 69, 87, 76, 20, 18, 5, 19, 30, 23, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C04488p(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1074Xx c1074Xx, InterfaceC04478o interfaceC04478o) {
        this(uncaughtExceptionHandler, c1074Xx, interfaceC04478o, C04558x.A00());
    }

    public C04488p(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1074Xx c1074Xx, InterfaceC04478o interfaceC04478o, InterfaceC04548w interfaceC04548w) {
        this.A02 = uncaughtExceptionHandler;
        if (c1074Xx != null) {
            this.A00 = c1074Xx;
            this.A03 = interfaceC04478o.A7U(c1074Xx);
            this.A01 = interfaceC04548w;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String strA03 = MA.A03(this.A00, th);
            if (!TextUtils.isEmpty(strA03) && strA03.contains(A00(17, 16, 41))) {
                Map<String, String> mapA02 = new C04468n(strA03, this.A03).A02();
                mapA02.put(A00(38, 7, 38), A00(33, 5, 101));
                Throwable thA00 = AbstractRunnableC0740Kv.A00();
                String strA00 = A00(45, 12, 98);
                if (thA00 != th) {
                    mapA02.put(strA00, A00(0, 1, 91));
                } else {
                    mapA02.put(strA00, A00(1, 1, 108));
                }
                this.A01.AFj(new AnonymousClass93(this.A00.A07().A01(), this.A00.A07().A02(), mapA02), this.A00);
                if (JR.A1R(this.A00)) {
                    JR.A0b(this.A00);
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
