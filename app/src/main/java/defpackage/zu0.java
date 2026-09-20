package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zu0 {
    public static final int a = a(Throwable.class, -1);
    public static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public static final WeakHashMap<Class<? extends Throwable>, j81<Throwable, Throwable>> c = new WeakHashMap<>();

    public static final class CQf extends cx1 implements j81 {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final class F1 extends cx1 implements j81 {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final class QnHx<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return OW8.m(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    public static final int a(Class<?> cls, int i) {
        Object qnHx;
        JvmClassMappingKt.getKotlinClass(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                qnHx = new fq3.QnHx(th);
            }
        } while (cls != null);
        qnHx = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (qnHx instanceof fq3.QnHx) {
            qnHx = objValueOf;
        }
        return ((Number) qnHx).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00fd A[EDGE_INSN: B:103:0x00fd->B:65:0x00fd BREAK  A[LOOP:3: B:41:0x00a5->B:107:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[LOOP:3: B:41:0x00a5->B:107:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E b(E e, Throwable th) {
        Object qnHx;
        j81<Throwable, Throwable> yu0Var;
        if (e instanceof l90) {
            try {
                qnHx = ((l90) e).a();
            } catch (Throwable th2) {
                qnHx = new fq3.QnHx(th2);
            }
            return (E) (qnHx instanceof fq3.QnHx ? null : qnHx);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        WeakHashMap<Class<? extends Throwable>, j81<Throwable, Throwable>> weakHashMap = c;
        try {
            j81<Throwable, Throwable> j81Var = weakHashMap.get(e.getClass());
            lock.unlock();
            if (j81Var != null) {
                return (E) j81Var.invoke(e);
            }
            int i = 0;
            if (a != a(e.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    weakHashMap.put((Class<? extends Throwable>) e.getClass(), CQf.w);
                    sd5 sd5Var = sd5.a;
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    return null;
                } finally {
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
            j81<Throwable, Throwable> j81Var2 = null;
            for (Constructor constructor : oV9.h0(e.getClass().getConstructors(), new QnHx())) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length = parameterTypes.length;
                if (length != 0) {
                    if (length == 1) {
                        Class<?> cls = parameterTypes[0];
                        if (ur1.a(cls, Throwable.class)) {
                            yu0Var = new wu0(constructor);
                        } else if (ur1.a(cls, String.class)) {
                            yu0Var = new xu0(constructor);
                        } else {
                            j81Var2 = null;
                        }
                    } else if (length == 2 && ur1.a(parameterTypes[0], String.class) && ur1.a(parameterTypes[1], Throwable.class)) {
                        yu0Var = new vu0(constructor);
                    } else {
                        j81Var2 = null;
                    }
                    if (j81Var2 != null) {
                        break;
                    }
                } else {
                    yu0Var = new yu0(constructor);
                }
                j81Var2 = yu0Var;
                if (j81Var2 != null) {
                    break;
                    break;
                }
            }
            ReentrantReadWriteLock.ReadLock lock3 = reentrantReadWriteLock.readLock();
            int readHoldCount2 = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i3 = 0; i3 < readHoldCount2; i3++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
            writeLock2.lock();
            try {
                weakHashMap.put((Class<? extends Throwable>) e.getClass(), j81Var2 == null ? F1.w : j81Var2);
                sd5 sd5Var2 = sd5.a;
                while (i < readHoldCount2) {
                    lock3.lock();
                    i++;
                }
                writeLock2.unlock();
                if (j81Var2 != null) {
                    return (E) j81Var2.invoke(th);
                }
                return null;
            } catch (Throwable th3) {
                while (i < readHoldCount2) {
                    lock3.lock();
                    i++;
                }
                writeLock2.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            lock.unlock();
            throw th4;
        }
    }
}
