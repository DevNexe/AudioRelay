package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ry<T> {
    public final String a;
    public final Set<Class<? super T>> b;
    public final Set<kj0> c;
    public final int d;
    public final int e;
    public final ez<T> f;
    public final Set<Class<?>> g;

    public static class QnHx<T> {
        public final HashSet a;
        public final HashSet b;
        public int c;
        public int d;
        public ez<T> e;
        public final HashSet f;

        public QnHx(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = new HashSet();
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                if (cls2 == null) {
                    throw new NullPointerException("Null interface");
                }
            }
            Collections.addAll(this.a, clsArr);
        }

        public final void a(kj0 kj0Var) {
            if (!(!this.a.contains(kj0Var.a))) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.b.add(kj0Var);
        }

        public final ry<T> b() {
            if (this.e != null) {
                return new ry<>(null, new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c() {
            if (!(this.c == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.c = 2;
        }
    }

    public ry(String str, Set<Class<? super T>> set, Set<kj0> set2, int i, int i2, ez<T> ezVar, Set<Class<?>> set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = ezVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static <T> QnHx<T> a(Class<T> cls) {
        return new QnHx<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> ry<T> b(final T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        for (Class<? super T> cls2 : clsArr) {
            if (cls2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, clsArr);
        return new ry<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ez() { // from class: py
            @Override // defpackage.ez
            public final Object a(cq3 cq3Var) {
                return t;
            }
        }, hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
