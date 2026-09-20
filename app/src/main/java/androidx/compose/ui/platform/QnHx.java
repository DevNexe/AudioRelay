package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import com.azefsw.audioconnect.R;
import defpackage.ba4;
import defpackage.byN;
import defpackage.dj5;
import defpackage.k40;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byN w;

    public QnHx(byN byn) {
        this.w = byn;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        byN byn = this.w;
        Iterator it = ba4.G0(byn.getParent(), dj5.F).iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object obj = (ViewParent) it.next();
            if (obj instanceof View) {
                Object tag = ((View) obj).getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        k40 k40Var = byn.y;
        if (k40Var != null) {
            ((WrappedComposition) k40Var).a();
        }
        byn.y = null;
        byn.requestLayout();
    }
}
