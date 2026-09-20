package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import defpackage.xApe;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {

    public static class RecycleListView extends ListView {
        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xApe.N);
            typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }
}
