package defpackage;

import android.content.Context;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class tw6 extends vx6 {
    public final Context a;
    public final my6 b;

    public tw6(Context context, @Nullable my6 my6Var) {
        this.a = context;
        this.b = my6Var;
    }

    @Override // defpackage.vx6
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.vx6
    @Nullable
    public final my6 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        my6 my6Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vx6) {
            vx6 vx6Var = (vx6) obj;
            if (this.a.equals(vx6Var.a()) && ((my6Var = this.b) != null ? my6Var.equals(vx6Var.b()) : vx6Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        my6 my6Var = this.b;
        return iHashCode ^ (my6Var == null ? 0 : my6Var.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.b) + "}";
    }
}
