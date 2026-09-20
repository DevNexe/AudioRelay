package defpackage;

import android.view.View;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class sj5 extends cx1 implements j81<View, iu2> {
    public static final sj5 w = new sj5();

    public sj5() {
        super(1);
    }

    @Override // defpackage.j81
    public final iu2 invoke(View view) {
        Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof iu2) {
            return (iu2) tag;
        }
        return null;
    }
}
