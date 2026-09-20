package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class QnHx implements T23 {
    public T23.QnHx A;
    public final int B = R.layout.abc_action_menu_item_layout;
    public byN C;
    public final Context w;
    public Context x;
    public NUlFixed y;
    public final LayoutInflater z;

    public QnHx(Context context) {
        this.w = context;
        this.z = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void d(T23.QnHx qnHx) {
        this.A = qnHx;
    }

    @Override // androidx.appcompat.view.menu.T23
    public final boolean e(YKK ykk) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.T23
    public final boolean j(YKK ykk) {
        return false;
    }
}
