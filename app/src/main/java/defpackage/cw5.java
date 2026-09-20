package defpackage;

import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzzi;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cw5 {
    public zzaam b;
    public zzzi c;
    public aw5 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final yv5 a = new yv5();
    public d7G j = new d7G(10);

    public abstract long a(zzed zzedVar);

    public void b(boolean z) {
        int i;
        if (z) {
            this.j = new d7G(10);
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean c(zzed zzedVar, long j, d7G d7g);

    public void d(long j) {
        this.g = j;
    }
}
