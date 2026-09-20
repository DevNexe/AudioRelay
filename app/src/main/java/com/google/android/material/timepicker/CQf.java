package com.google.android.material.timepicker;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import defpackage.UT;
import defpackage.d_OZ;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf extends d_OZ {
    public final /* synthetic */ ClockFaceView d;

    public CQf(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // defpackage.d_OZ
    public final void d(View view, UT ut) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            TextView textView = this.d.S.get(iIntValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(textView);
            }
        }
        ut.k(UT.F1.a(0, 1, iIntValue, 1, view.isSelected()));
    }
}
