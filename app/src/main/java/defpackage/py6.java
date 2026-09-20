package defpackage;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class py6 implements my6 {

    @CheckForNull
    public volatile my6 w;
    public volatile boolean x;

    @CheckForNull
    public Object y;

    public py6(my6 my6Var) {
        this.w = my6Var;
    }

    public final String toString() {
        Object obj = this.w;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.y + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.my6
    public final Object zza() {
        if (!this.x) {
            synchronized (this) {
                if (!this.x) {
                    my6 my6Var = this.w;
                    my6Var.getClass();
                    Object objZza = my6Var.zza();
                    this.y = objZza;
                    this.x = true;
                    this.w = null;
                    return objZza;
                }
            }
        }
        return this.y;
    }
}
