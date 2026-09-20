package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes3.dex */
public final class bq extends d_OZ {
    public final /* synthetic */ CheckableImageButton d;

    public bq(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    @Override // defpackage.d_OZ
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.isChecked());
    }

    @Override // defpackage.d_OZ
    public final void d(View view, UT ut) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.A);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
