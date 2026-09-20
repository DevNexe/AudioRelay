package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class fy {
    public final Object a;
    public final lm b;
    public final j81<Throwable, sd5> c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public fy(Object obj, lm lmVar, j81<? super Throwable, sd5> j81Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = lmVar;
        this.c = j81Var;
        this.d = obj2;
        this.e = th;
    }

    public static fy a(fy fyVar, lm lmVar, CancellationException cancellationException, int i) {
        Object obj = (i & 1) != 0 ? fyVar.a : null;
        if ((i & 2) != 0) {
            lmVar = fyVar.b;
        }
        lm lmVar2 = lmVar;
        j81<Throwable, sd5> j81Var = (i & 4) != 0 ? fyVar.c : null;
        Object obj2 = (i & 8) != 0 ? fyVar.d : null;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = fyVar.e;
        }
        fyVar.getClass();
        return new fy(obj, lmVar2, j81Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy)) {
            return false;
        }
        fy fyVar = (fy) obj;
        return ur1.a(this.a, fyVar.a) && ur1.a(this.b, fyVar.b) && ur1.a(this.c, fyVar.c) && ur1.a(this.d, fyVar.d) && ur1.a(this.e, fyVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        lm lmVar = this.b;
        int iHashCode2 = (iHashCode + (lmVar == null ? 0 : lmVar.hashCode())) * 31;
        j81<Throwable, sd5> j81Var = this.c;
        int iHashCode3 = (iHashCode2 + (j81Var == null ? 0 : j81Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ fy(Object obj, lm lmVar, j81 j81Var, Object obj2, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : lmVar, (i & 4) != 0 ? null : j81Var, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : cancellationException);
    }
}
