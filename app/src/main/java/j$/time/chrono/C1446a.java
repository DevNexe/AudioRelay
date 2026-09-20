package j$.time.chrono;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1446a implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = AbstractC1449d.c;
        return Long.compare(((InterfaceC1451f) obj).E(), ((InterfaceC1451f) obj2).E());
    }
}
