package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Olf extends cx1 implements h81<SparseArray<Parcelable>> {
    public final /* synthetic */ kl3<zi5<View>> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Olf(kl3<zi5<View>> kl3Var) {
        super(0);
        this.w = kl3Var;
    }

    @Override // defpackage.h81
    public final SparseArray<Parcelable> invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        View typedView$ui_release = this.w.a.getTypedView$ui_release();
        if (typedView$ui_release != null) {
            typedView$ui_release.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}
