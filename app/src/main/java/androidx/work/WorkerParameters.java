package androidx.work;

import android.net.Network;
import android.net.Uri;
import defpackage.c15;
import defpackage.co5;
import defpackage.do5;
import defpackage.if3;
import defpackage.j51;
import defpackage.jn5;
import defpackage.un5;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final CQf b;
    public final HashSet c;
    public final QnHx d;
    public final int e;
    public final Executor f;
    public final c15 g;
    public final do5 h;
    public final if3 i;
    public final j51 j;

    public static class QnHx {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, CQf cQf, List list, QnHx qnHx, int i, ExecutorService executorService, c15 c15Var, co5 co5Var, un5 un5Var, jn5 jn5Var) {
        this.a = uuid;
        this.b = cQf;
        this.c = new HashSet(list);
        this.d = qnHx;
        this.e = i;
        this.f = executorService;
        this.g = c15Var;
        this.h = co5Var;
        this.i = un5Var;
        this.j = jn5Var;
    }
}
