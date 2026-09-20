package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0605Fl {
    public static String[] A04 = {"HGHzNcawqnVFgJx8ceQNwcxcn1SDkpDb", "AD2ta0a", "biSUTEi4nYJndXTTLsT", "38FOXeSW4cnwnxdXp60to", "WtyRCcfaPM", "iLolo35", "fvJAwdggv90DLF", "FbA7S8K"};
    public final int A00;

    @Nullable
    public final FY A01;
    public final long A02;
    public final CopyOnWriteArrayList<C0604Fk> A03;

    public C0605Fl() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C0605Fl(CopyOnWriteArrayList<C0604Fk> copyOnWriteArrayList, int i, @Nullable FY fy, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = fy;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA01 = AG.A01(j);
        if (jA01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.A02;
        if (A04[2].length() != 19) {
            throw new RuntimeException();
        }
        A04[7] = "vQJR5ZN";
        return j2 + jA01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CheckResult
    public final C0605Fl A02(int i, @Nullable FY fy, long j) {
        return new C0605Fl(this.A03, i, fy, j);
    }

    public final void A03() {
        IK.A04(this.A01 != null);
        for (C0604Fk listenerAndHandler : this.A03) {
            A01(listenerAndHandler.A00, new RunnableC0595Fb(this, listenerAndHandler.A01));
        }
    }

    public final void A04() {
        IK.A04(this.A01 != null);
        for (C0604Fk listenerAndHandler : this.A03) {
            A01(listenerAndHandler.A00, new RunnableC0596Fc(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        IK.A04(this.A01 != null);
        Iterator<C0604Fk> it = this.A03.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A04[7].length() != 7) {
                throw new RuntimeException();
            }
            A04[2] = "JAadAeVCHcunsRCfoQL";
            if (zHasNext) {
                C0604Fk listenerAndHandler = it.next();
                A01(listenerAndHandler.A00, new RunnableC0601Fh(this, listenerAndHandler.A01));
            } else {
                return;
            }
        }
    }

    public final void A06(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
        A0C(new C0607Fn(1, i, format, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC0608Fo interfaceC0608Fo) {
        IK.A03((handler == null || interfaceC0608Fo == null) ? false : true);
        this.A03.add(new C0604Fk(handler, interfaceC0608Fo));
    }

    public final void A08(C0606Fm c0606Fm, C0607Fn c0607Fn) {
        for (C0604Fk c0604Fk : this.A03) {
            A01(c0604Fk.A00, new RunnableC0599Ff(this, c0604Fk.A01, c0606Fm, c0607Fn));
        }
    }

    public final void A09(C0606Fm c0606Fm, C0607Fn c0607Fn) {
        for (C0604Fk c0604Fk : this.A03) {
            A01(c0604Fk.A00, new RunnableC0598Fe(this, c0604Fk.A01, c0606Fm, c0607Fn));
        }
    }

    public final void A0A(C0606Fm c0606Fm, C0607Fn c0607Fn) {
        for (C0604Fk c0604Fk : this.A03) {
            A01(c0604Fk.A00, new RunnableC0597Fd(this, c0604Fk.A01, c0606Fm, c0607Fn));
        }
    }

    public final void A0B(C0606Fm c0606Fm, C0607Fn c0607Fn, IOException iOException, boolean z) {
        for (C0604Fk listenerAndHandler : this.A03) {
            A01(listenerAndHandler.A00, new RunnableC0600Fg(this, listenerAndHandler.A01, c0606Fm, c0607Fn, iOException, z));
        }
    }

    public final void A0C(C0607Fn c0607Fn) {
        for (C0604Fk c0604Fk : this.A03) {
            A01(c0604Fk.A00, new RunnableC0603Fj(this, c0604Fk.A01, c0607Fn));
        }
    }

    public final void A0D(InterfaceC0608Fo interfaceC0608Fo) {
        for (C0604Fk c0604Fk : this.A03) {
            if (c0604Fk.A01 == interfaceC0608Fo) {
                this.A03.remove(c0604Fk);
            }
        }
    }

    public final void A0E(C0654Hi c0654Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3) {
        A0A(new C0606Fm(c0654Hi, j3, 0L, 0L), new C0607Fn(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(C0654Hi c0654Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new C0606Fm(c0654Hi, j3, j4, j5), new C0607Fn(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(C0654Hi c0654Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new C0606Fm(c0654Hi, j3, j4, j5), new C0607Fn(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(C0654Hi c0654Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        A0B(new C0606Fm(c0654Hi, j3, j4, j5), new C0607Fn(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}
