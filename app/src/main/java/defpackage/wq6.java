package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzas;

/* JADX INFO: loaded from: classes.dex */
public final class wq6 extends RelativeLayout {
    public final zzas w;
    public boolean x;

    public wq6(Activity activity, String str, String str2, String str3) {
        super(activity);
        zzas zzasVar = new zzas(activity, str);
        this.w = zzasVar;
        zzasVar.zzo(str2);
        zzasVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.x) {
            return false;
        }
        this.w.zzm(motionEvent);
        return false;
    }
}
