package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.azefsw.audioconnect.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rs3 extends ViewGroup {
    public int A;
    public final int w;
    public final ArrayList x;
    public final ArrayList y;
    public final ss3 z;

    public rs3(Context context) {
        super(context);
        this.w = 5;
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.y = arrayList2;
        this.z = new ss3(0);
        setClipChildren(false);
        ts3 ts3Var = new ts3(context);
        addView(ts3Var);
        arrayList.add(ts3Var);
        arrayList2.add(ts3Var);
        this.A = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
