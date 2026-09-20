package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class yr extends cx1 implements h81<Boolean> {
    public final /* synthetic */ View w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr(View view) {
        super(0);
        this.w = view;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        boolean z;
        ViewParent parent = this.w.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                z = true;
                return Boolean.valueOf(z);
            }
            parent = viewGroup.getParent();
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
