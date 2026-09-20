package io.ktor.client.call;

import defpackage.ar;
import defpackage.ev4;
import defpackage.fv1;
import defpackage.mu;
import defpackage.qg1;
import defpackage.su;
import defpackage.to2;
import defpackage.uy2;
import defpackage.wu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {
    public final String w;

    public NoTransformationFoundException(qg1 qg1Var, ar arVar, fv1 fv1Var) {
        StringBuilder sb = new StringBuilder("No transformation found: ");
        sb.append(arVar);
        sb.append(" -> ");
        sb.append(fv1Var);
        sb.append("\n        |with response from ");
        sb.append(qg1Var.c().d().getUrl());
        sb.append(":\n        |status: ");
        sb.append(qg1Var.i());
        sb.append("\n        |response headers: \n        |");
        Set<Map.Entry<String, List<String>>> setA = qg1Var.a().a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(mu.w0(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new uy2(entry.getKey(), (String) it2.next()));
            }
            su.x0(arrayList2, arrayList);
        }
        sb.append(wu.M0(arrayList, null, null, null, to2.w, 31));
        sb.append("\n    ");
        this.w = ev4.m(sb.toString());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.w;
    }
}
