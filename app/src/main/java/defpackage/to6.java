package defpackage;

import com.google.android.gms.internal.ads.zzfsg;
import com.google.android.gms.internal.ads.zzfsy;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class to6 extends zzfsy {
    public final /* synthetic */ Iterator y;
    public final /* synthetic */ zzfsg z;

    public to6(Iterator it, zzfsg zzfsgVar) {
        this.y = it;
        this.z = zzfsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    @CheckForNull
    public final Object a() {
        Object next;
        do {
            Iterator it = this.y;
            if (!it.hasNext()) {
                this.x = 3;
                return null;
            }
            next = it.next();
        } while (!this.z.zza(next));
        return next;
    }
}
