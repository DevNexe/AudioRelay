package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class qz extends B8C implements gz {
    public static final nz C = new nz(0);
    public final kz B;
    public final zt0 z;
    public final HashMap w = new HashMap();
    public final HashMap x = new HashMap();
    public final HashMap y = new HashMap();
    public final AtomicReference<Boolean> A = new AtomicReference<>();

    public qz(Executor executor, ArrayList arrayList, ArrayList arrayList2, kz kzVar) {
        zt0 zt0Var = new zt0(executor);
        this.z = zt0Var;
        this.B = kzVar;
        ArrayList<ry> arrayList3 = new ArrayList();
        int i = 0;
        arrayList3.add(ry.b(zt0Var, zt0.class, hw4.class, tg3.class));
        arrayList3.add(ry.b(this, gz.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ry ryVar = (ry) it.next();
            if (ryVar != null) {
                arrayList3.add(ryVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((pg3) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.B.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.w.isEmpty()) {
                le0.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.w.keySet());
                arrayList6.addAll(arrayList3);
                le0.a(arrayList6);
            }
            for (ry ryVar2 : arrayList3) {
                this.w.put(ryVar2, new nz1(new lz(i, this, ryVar2)));
            }
            arrayList5.addAll(X0(arrayList3));
            arrayList5.addAll(Y0());
            W0();
        }
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.A.get();
        if (bool != null) {
            V0(this.w, bool.booleanValue());
        }
    }

    @Override // defpackage.yy
    public final synchronized <T> pg3<Set<T>> N(Class<T> cls) {
        f22 f22Var = (f22) this.y.get(cls);
        if (f22Var != null) {
            return f22Var;
        }
        return C;
    }

    public final void V0(Map<ry<?>, pg3<?>> map, boolean z) {
        int i;
        ArrayDeque<xt0> arrayDeque;
        Set<Map.Entry> setEmptySet;
        Iterator<Map.Entry<ry<?>, pg3<?>>> it = map.entrySet().iterator();
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<ry<?>, pg3<?>> next = it.next();
            ry<?> key = next.getKey();
            pg3<?> value = next.getValue();
            int i2 = key.d;
            if (!(i2 == 1)) {
                if (!(i2 == 2) || !z) {
                }
            }
            value.get();
        }
        zt0 zt0Var = this.z;
        synchronized (zt0Var) {
            try {
                arrayDeque = zt0Var.b;
                if (arrayDeque != null) {
                    zt0Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            for (xt0 xt0Var : arrayDeque) {
                xt0Var.getClass();
                synchronized (zt0Var) {
                    ArrayDeque arrayDeque2 = zt0Var.b;
                    if (arrayDeque2 != null) {
                        arrayDeque2.add(xt0Var);
                    } else {
                        synchronized (zt0Var) {
                            Map map2 = (Map) zt0Var.a.get(null);
                            setEmptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : setEmptySet) {
                            ((Executor) entry.getValue()).execute(new qs1(i, entry, xt0Var));
                        }
                    }
                }
            }
        }
    }

    public final void W0() {
        for (ry ryVar : this.w.keySet()) {
            for (kj0 kj0Var : ryVar.c) {
                boolean z = kj0Var.b == 2;
                Class<?> cls = kj0Var.a;
                if (z) {
                    HashMap map = this.y;
                    if (!map.containsKey(cls)) {
                        map.put(cls, new f22(Collections.emptySet()));
                    }
                }
                HashMap map2 = this.x;
                if (map2.containsKey(cls)) {
                    continue;
                } else {
                    int i = kj0Var.b;
                    if (i == 1) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", ryVar, cls));
                    }
                    if (!(i == 2)) {
                        map2.put(cls, new sv2(sv2.c, sv2.d));
                    }
                }
            }
        }
    }

    public final ArrayList X0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ry ryVar = (ry) it.next();
            int i = 1;
            if (ryVar.e == 0) {
                pg3 pg3Var = (pg3) this.w.get(ryVar);
                Iterator it2 = ryVar.b.iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    HashMap map = this.x;
                    if (map.containsKey(cls)) {
                        arrayList2.add(new qs1(i, (sv2) ((pg3) map.get(cls)), pg3Var));
                    } else {
                        map.put(cls, pg3Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList Y0() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.w.entrySet()) {
            ry ryVar = (ry) entry.getKey();
            if (!(ryVar.e == 0)) {
                pg3 pg3Var = (pg3) entry.getValue();
                Iterator it = ryVar.b.iterator();
                while (it.hasNext()) {
                    Class cls = (Class) it.next();
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(pg3Var);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.y;
            if (map2.containsKey(key)) {
                f22 f22Var = (f22) map2.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new tp3(2, f22Var, (pg3) it2.next()));
                }
            } else {
                map2.put((Class) entry2.getKey(), new f22((Set) ((Collection) entry2.getValue())));
            }
        }
        return arrayList;
    }

    @Override // defpackage.yy
    public final <T> mi0<T> q0(Class<T> cls) {
        pg3<T> pg3VarU = u(cls);
        if (pg3VarU == null) {
            return new sv2(sv2.c, sv2.d);
        }
        return pg3VarU instanceof sv2 ? (sv2) pg3VarU : new sv2(null, pg3VarU);
    }

    @Override // defpackage.yy
    public final synchronized <T> pg3<T> u(Class<T> cls) {
        return (pg3) this.x.get(cls);
    }
}
