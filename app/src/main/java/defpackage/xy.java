package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
public final class xy {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ComponentActivity componentActivity, sz szVar) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        b30 b30Var = childAt instanceof b30 ? (b30) childAt : null;
        if (b30Var != null) {
            b30Var.setParentCompositionContext(null);
            b30Var.setContent(szVar);
            return;
        }
        b30 b30Var2 = new b30(componentActivity);
        b30Var2.setParentCompositionContext(null);
        b30Var2.setContent(szVar);
        View decorView = componentActivity.getWindow().getDecorView();
        if (XTd3.i(decorView) == null) {
            decorView.setTag(com.azefsw.audioconnect.R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (C0239D.q(decorView) == null) {
            decorView.setTag(com.azefsw.audioconnect.R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (tj5.a(decorView) == null) {
            tj5.b(decorView, componentActivity);
        }
        componentActivity.setContentView(b30Var2, a);
    }
}
