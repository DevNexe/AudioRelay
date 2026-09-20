package defpackage;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jz implements kz {
    @Override // defpackage.kz
    public final List<ry<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final ry<?> ryVar : componentRegistrar.getComponents()) {
            final String str = ryVar.a;
            if (str != null) {
                ryVar = new ry<>(str, ryVar.b, ryVar.c, ryVar.d, ryVar.e, new ez() { // from class: iz
                    @Override // defpackage.ez
                    public final Object a(cq3 cq3Var) {
                        String str2 = str;
                        ry ryVar2 = ryVar;
                        try {
                            Trace.beginSection(str2);
                            return ryVar2.f.a(cq3Var);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, ryVar.g);
            }
            arrayList.add(ryVar);
        }
        return arrayList;
    }
}
