package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import defpackage.eh2;
import defpackage.qLd;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void s(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.YKK) && (((CoordinatorLayout.YKK) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (z) {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        Field field = bi5.a;
                        bi5.LPt8Fixed.s(childAt, 4);
                    } else {
                        HashMap map = this.i;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.i.get(childAt)).intValue();
                            Field field2 = bi5.a;
                            bi5.LPt8Fixed.s(childAt, iIntValue);
                        }
                    }
                }
            }
            if (!z) {
                this.i = null;
            }
        }
        super.s(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final FabTransformationBehavior.CQf z(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.CQf cQf = new FabTransformationBehavior.CQf();
        cQf.a = eh2.a(context, i);
        cQf.b = new qLd();
        return cQf;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
