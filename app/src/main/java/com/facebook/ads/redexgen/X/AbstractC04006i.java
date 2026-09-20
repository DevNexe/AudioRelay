package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04006i {
    public final Context A00;
    public final C6C A01;

    public AbstractC04006i(Context context, C6C c6c) {
        this.A00 = context;
        this.A01 = c6c;
    }

    private int A00(C6C c6c, C04106s c04106s) {
        if (c6c.A0e(c04106s.A00()) != null) {
            return c6c.A0e(c04106s.A00()).intValue();
        }
        if (c04106s.A03().contains(EnumC04176z.A0B)) {
            return c6c.A0S();
        }
        if (c04106s.A03().contains(EnumC04176z.A08)) {
            return c6c.A0R();
        }
        return c6c.A0V();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A01(EnumC04146w enumC04146w, List<C04106s> list) {
        C7A c7aA04;
        C7A c7aA02;
        Map<Integer, C6H<C7A>> mapA03 = C04156x.A01().A03();
        for (C04106s c04106s : list) {
            InterfaceC04136v signalExecutor = c04106s.A02(enumC04146w);
            if (signalExecutor != null) {
                try {
                    c7aA04 = signalExecutor.A5J();
                } catch (Throwable th) {
                    c7aA04 = C7J.A04(this.A00.getPackageName(), th);
                }
                if (c7aA04 != null && c7aA04.A07() != null) {
                    if (c04106s.A03().contains(EnumC04176z.A0B) && mapA03.containsKey(Integer.valueOf(c04106s.A00()))) {
                        C6H<C7A> c6h = mapA03.get(Integer.valueOf(c04106s.A00()));
                        if (c6h != null) {
                            c7aA02 = c6h.A02();
                        } else {
                            c7aA02 = null;
                        }
                        if (c6h == null) {
                            c6h = new C6H<>(A00(this.A01, c04106s));
                        }
                        if (c7aA02 == null || !c7aA04.A0B(c7aA02, c04106s.A03())) {
                            c6h.A04(c7aA04);
                            C04156x.A01().A04(c04106s.A00(), c6h, c7aA04.A05());
                        }
                    } else {
                        C6H<C7A> c6h2 = new C6H<>(A00(this.A01, c04106s));
                        c6h2.A04(c7aA04);
                        C04156x.A01().A04(c04106s.A00(), c6h2, c7aA04.A05());
                    }
                }
            }
        }
    }
}
