package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class y05<A, ResultT> {
    public final tw0[] a;
    public final boolean b;
    public final int c;

    public static class QnHx<A, ResultT> {
        public em3<A, z05<ResultT>> a;
        public tw0[] c;
        public boolean b = true;
        public int d = 0;
    }

    public y05(tw0[] tw0VarArr, boolean z, int i) {
        this.a = tw0VarArr;
        boolean z2 = false;
        if (tw0VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }
}
