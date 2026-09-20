package defpackage;

import com.google.android.gms.internal.ads.zzfss;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class bn6 implements Iterable {
    public final /* synthetic */ CharSequence w;
    public final /* synthetic */ zzfss x;

    public bn6(zzfss zzfssVar, CharSequence charSequence) {
        this.x = zzfssVar;
        this.w = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        zzfss zzfssVar = this.x;
        return zzfssVar.b.a(zzfssVar, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    Object next2 = it.next();
                    next2.getClass();
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
