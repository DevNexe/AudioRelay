package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class xx5 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
