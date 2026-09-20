package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbxs;

/* JADX INFO: loaded from: classes3.dex */
public final class r66 implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbxs w;

    public r66(zzbxs zzbxsVar) {
        this.w = zzbxsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbxs zzbxsVar = this.w;
        zzbxsVar.getClass();
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", zzbxsVar.e);
        data.putExtra("eventLocation", zzbxsVar.i);
        data.putExtra("description", zzbxsVar.h);
        long j = zzbxsVar.f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = zzbxsVar.g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        zzt.zzq();
        zzs.zzJ(zzbxsVar.d, data);
    }
}
