package defpackage;

import com.google.android.gms.internal.ads.zzfrr;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfss;

/* JADX INFO: loaded from: classes3.dex */
public final class zm6 extends cn6 {
    public final /* synthetic */ od6 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm6(od6 od6Var, zzfss zzfssVar, CharSequence charSequence) {
        super(zzfssVar, charSequence);
        this.B = od6Var;
    }

    @Override // defpackage.cn6
    public final int d(int i) {
        return i + 1;
    }

    @Override // defpackage.cn6
    public final int e(int i) {
        zzfrr zzfrrVar = (zzfrr) this.B.x;
        CharSequence charSequence = this.y;
        int length = charSequence.length();
        zzfsf.zzb(i, length, "index");
        while (i < length) {
            if (zzfrrVar.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
