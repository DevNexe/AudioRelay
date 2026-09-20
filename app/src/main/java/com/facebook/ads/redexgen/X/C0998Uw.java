package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0998Uw implements InterfaceC0667Hx {
    public static String[] A03 = {"zA1HDLVhPd9PsL9PenCbpcrAKXxlN0d6", "FLS1DqH1RbizqOpj", "1z8O9NEtb5xyjYGA", "8w8GUSv0BTEQmaLhHrYTkFjQIFXWxu0p", "o1jGjvwpoOOHSDmJh0w1BZ4ZQReO8O7V", "", "IXAYHKYtOagUrLCRc2OBPi2ErH2JE5Q2", "ufrZt7t49gDVq6vRzV1VlqPqnp3Kfu3W"};
    public HandlerC0661Hr<? extends InterfaceC0662Hs> A00;
    public IOException A01;
    public final ExecutorService A02;

    public C0998Uw(String str) {
        this.A02 = C0695Iz.A0T(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hs> */
    public final <T extends InterfaceC0662Hs> long A04(T loadable, InterfaceC0660Hq<T> interfaceC0660Hq, int i) {
        Looper looperMyLooper = Looper.myLooper();
        IK.A04(looperMyLooper != null);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0661Hr(this, looperMyLooper, loadable, interfaceC0660Hq, i, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0661Hr<? extends InterfaceC0662Hs> handlerC0661Hr = this.A00;
            if (handlerC0661Hr != null) {
                if (A03[0].charAt(1) != 'f') {
                    String[] strArr = A03;
                    strArr[2] = "ShO16ogjgPVIHMzl";
                    strArr[1] = "8gZONBnlwtDMou1V";
                    if (i == Integer.MIN_VALUE) {
                        i = handlerC0661Hr.A03;
                    }
                    handlerC0661Hr.A05(i);
                    return;
                }
                throw new RuntimeException();
            }
            return;
        }
        throw iOException;
    }

    public final void A07(@Nullable InterfaceC0663Ht interfaceC0663Ht) {
        HandlerC0661Hr<? extends InterfaceC0662Hs> handlerC0661Hr = this.A00;
        if (handlerC0661Hr != null) {
            handlerC0661Hr.A07(true);
        }
        if (interfaceC0663Ht != null) {
            this.A02.execute(new RunnableC0664Hu(interfaceC0663Ht));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
