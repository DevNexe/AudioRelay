package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l86<T> implements y96<T> {
    public static final Object y = new Object();
    public volatile y96<T> w;
    public volatile Object x = y;

    public l86(u86 u86Var) {
        this.w = u86Var;
    }

    public static y96 a(u86 u86Var) {
        return u86Var instanceof l86 ? u86Var : new l86(u86Var);
    }

    @Override // defpackage.y96
    public final T zzb() {
        T tZzb = (T) this.x;
        Object obj = y;
        if (tZzb == obj) {
            synchronized (this) {
                tZzb = (T) this.x;
                if (tZzb == obj) {
                    tZzb = this.w.zzb();
                    Object obj2 = this.x;
                    if (obj2 != obj && obj2 != tZzb) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tZzb);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.x = tZzb;
                    this.w = null;
                }
            }
        }
        return tZzb;
    }
}
