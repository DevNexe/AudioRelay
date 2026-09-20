package defpackage;

import android.view.View;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class tj5 {

    public static final class CQf extends cx1 implements j81<View, b34> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final b34 invoke(View view) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof b34) {
                return (b34) tag;
            }
            return null;
        }
    }

    public static final class QnHx extends cx1 implements j81<View, View> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final View invoke(View view) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    public static final b34 a(View view) {
        jx0.QnHx qnHx = new jx0.QnHx(new jx0(new q95(ba4.G0(view, QnHx.w), CQf.w), false, ja4.w));
        return (b34) (!qnHx.hasNext() ? null : qnHx.next());
    }

    public static final void b(View view, b34 b34Var) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, b34Var);
    }
}
