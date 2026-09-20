package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ae5 extends RippleDrawable {
    public static Method A;
    public static boolean B;
    public final boolean w;
    public yu x;
    public Integer y;
    public boolean z;

    public static final class QnHx {
        public static final QnHx a = new QnHx();

        public final void a(RippleDrawable rippleDrawable, int i) {
            rippleDrawable.setRadius(i);
        }
    }

    public ae5(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.w = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.w) {
            this.z = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.z = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.z;
    }
}
