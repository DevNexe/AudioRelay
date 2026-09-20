package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t51 implements mu2 {
    public final /* synthetic */ u51 a;

    public t51(u51 u51Var) {
        this.a = u51Var;
    }

    @Override // defpackage.mu2
    public final void a() {
        u51 u51Var = this.a;
        x51<?> x51Var = u51Var.K.a;
        x51Var.z.b(x51Var, x51Var, null);
        Bundle bundleA = u51Var.A.b.a("android:support:fragments");
        if (bundleA != null) {
            Parcelable parcelable = bundleA.getParcelable("android:support:fragments");
            x51<?> x51Var2 = u51Var.K.a;
            if (!(x51Var2 instanceof mj5)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            x51Var2.z.R(parcelable);
        }
    }
}
