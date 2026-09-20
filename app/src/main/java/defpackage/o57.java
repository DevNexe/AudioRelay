package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.internal.ads.zzapb;

/* JADX INFO: loaded from: classes.dex */
public final class o57 implements View.OnTouchListener {
    public final /* synthetic */ zzs w;

    public o57(zzs zzsVar) {
        this.w = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzapb zzapbVar = this.w.D;
        if (zzapbVar == null) {
            return false;
        }
        zzapbVar.zzd(motionEvent);
        return false;
    }
}
