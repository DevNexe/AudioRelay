package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ln4 implements Iterable<Object>, jv1 {
    public int A;
    public boolean B;
    public int C;
    public int x;
    public int z;
    public int[] w = new int[0];
    public Object[] y = new Object[0];
    public ArrayList<Z1> D = new ArrayList<>();

    public final int a(Z1 z1) {
        if (!(!this.B)) {
            e40.c("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        }
        if (z1.a()) {
            return z1.a;
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    public final kn4 b() {
        if (this.B) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.A++;
        return new kn4(this);
    }

    public final mn4 c() {
        if (!(!this.B)) {
            e40.c("Cannot start a writer when another writer is pending".toString());
            throw null;
        }
        if (!(this.A <= 0)) {
            e40.c("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        this.B = true;
        this.C++;
        return new mn4(this);
    }

    public final boolean e(Z1 z1) {
        if (!z1.a()) {
            return false;
        }
        int iT0 = fp1.t0(this.D, z1.a, this.x);
        return iT0 >= 0 && ur1.a(this.D.get(iT0), z1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new ab1(0, this.x, this);
    }
}
