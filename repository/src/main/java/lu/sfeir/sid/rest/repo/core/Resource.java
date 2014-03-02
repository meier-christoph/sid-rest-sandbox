/*
 * Copyright (C) 2014 - Christoph Meier.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package lu.sfeir.sid.rest.repo.core;

import org.jongo.marshall.jackson.oid.ObjectId;

import java.util.Date;

public class Resource<T>
{

    private ObjectId _id;
    private String _owner;
    private Date _createdAt;
    private T _data;

    public ObjectId getId()
    {
        return _id;
    }

    public void setId(final ObjectId id)
    {
        this._id = id;
    }

    public String getOwner()
    {
        return _owner;
    }

    public void setOwner(final String owner)
    {
        this._owner = owner;
    }

    public Date getCreatedAt()
    {
        return _createdAt;
    }

    public void setCreatedAt(final Date createdAt)
    {
        this._createdAt = createdAt;
    }

    public T getData()
    {
        return _data;
    }

    public void setData(final T data)
    {
        this._data = data;
    }
}
