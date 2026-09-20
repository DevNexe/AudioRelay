package defpackage;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class cq3 extends B8C {
    public final Set<Class<?>> A;
    public final Set<Class<?>> B;
    public final yy C;
    public final Set<Class<?>> w;
    public final Set<Class<?>> x;
    public final Set<Class<?>> y;
    public final Set<Class<?>> z;

    public static class QnHx implements tg3 {
        public final Set<Class<?>> a;
        public final tg3 b;

        public QnHx(Set<Class<?>> set, tg3 tg3Var) {
            this.a = set;
            this.b = tg3Var;
        }
    }

    public cq3(ry ryVar, qz qzVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (kj0 kj0Var : ryVar.c) {
            int i = kj0Var.c;
            boolean z = i == 0;
            int i2 = kj0Var.b;
            Class<?> cls = kj0Var.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else if (i == 2) {
                hashSet3.add(cls);
            } else if (i2 == 2) {
                hashSet5.add(cls);
            } else {
                hashSet2.add(cls);
            }
        }
        Set<Class<?>> set = ryVar.g;
        if (!set.isEmpty()) {
            hashSet.add(tg3.class);
        }
        this.w = Collections.unmodifiableSet(hashSet);
        this.x = Collections.unmodifiableSet(hashSet2);
        this.y = Collections.unmodifiableSet(hashSet3);
        this.z = Collections.unmodifiableSet(hashSet4);
        this.A = Collections.unmodifiableSet(hashSet5);
        this.B = set;
        this.C = qzVar;
    }

    @Override // defpackage.yy
    public final <T> pg3<Set<T>> N(Class<T> cls) {
        if (this.A.contains(cls)) {
            return this.C.N(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // defpackage.B8C, defpackage.yy
    public final <T> Set<T> Y(Class<T> cls) {
        if (this.z.contains(cls)) {
            return this.C.Y(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // defpackage.B8C, defpackage.yy
    public final <T> T d(Class<T> cls) {
        if (!this.w.contains(cls)) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.C.d(cls);
        return !cls.equals(tg3.class) ? t : (T) new QnHx(this.B, (tg3) t);
    }

    @Override // defpackage.yy
    public final <T> mi0<T> q0(Class<T> cls) {
        if (this.y.contains(cls)) {
            return this.C.q0(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }

    @Override // defpackage.yy
    public final <T> pg3<T> u(Class<T> cls) {
        if (this.x.contains(cls)) {
            return this.C.u(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }
}
