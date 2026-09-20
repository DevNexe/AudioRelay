package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fa3 implements da3, qf6 {
    public static final /* synthetic */ fa3 w = new fa3();

    @Override // defpackage.da3
    public void a(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // defpackage.da3
    public void b(View view, int i, int i2) {
    }

    @Override // defpackage.da3
    public void c(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzF());
    }
}
