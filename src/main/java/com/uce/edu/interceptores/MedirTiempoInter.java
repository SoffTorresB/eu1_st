package com.uce.edu.interceptores;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(2020)

public class MedirTiempoInter {
    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        long init = System.currentTimeMillis();
        try {
            return context.proceed();
        } finally {
            long fin = System.currentTimeMillis();
            System.out.println("DURACION: " + (fin - init) + " MS: ");
        }
    }
}