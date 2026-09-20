package defpackage;

import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i61 implements Runnable {
    public final /* synthetic */ ArrayList A;
    public final /* synthetic */ int w;
    public final /* synthetic */ ArrayList x;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ ArrayList z;

    public i61(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.w = i;
        this.x = arrayList;
        this.y = arrayList2;
        this.z = arrayList3;
        this.A = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.w; i++) {
            View view = (View) this.x.get(i);
            String str = (String) this.y.get(i);
            Field field = bi5.a;
            bi5.byN.v(view, str);
            bi5.byN.v((View) this.z.get(i), (String) this.A.get(i));
        }
    }
}
